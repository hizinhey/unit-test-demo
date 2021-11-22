/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.service.thrift;

import com.mycompany.mavenproject2.constant.ErrorCode;
import com.mycompany.mavenproject2.database.DatabaseInterface;
import com.mycompany.mavenproject2.thrift.CategoryInfo;
import com.mycompany.mavenproject2.thrift.CategoryInfoResult;

/**
 *
 * @author nghia
 */
public class TServer {
    
    private DatabaseInterface database;
    
    public TServer(DatabaseInterface database){
        this.database = database;
    }
    
    public void setDatabase(DatabaseInterface database){
        this.database = database;
    }
    
    public CategoryInfoResult getInfo(String id){
        
        CategoryInfo categoryInfo = database.getInfo(id);
        
        if(categoryInfo != null) {
            CategoryInfoResult res = new CategoryInfoResult(ErrorCode.SUCCESS);
            res.setMsg_error("OK");
            res.setValue(categoryInfo);
            return res;
        } else {
            CategoryInfoResult res = new CategoryInfoResult(ErrorCode.FAIL);
            res.setMsg_error("Fail");
            return res;
        }
    }
}
