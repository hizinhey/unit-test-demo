/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.database;

import com.mycompany.mavenproject2.thrift.CategoryInfo;

/**
 *
 * @author nghia
 */
public class MongoDBImpl implements DatabaseInterface {

    @Override
    public CategoryInfo getInfo(String id) {
        if(id != null){
            CategoryInfo info = new CategoryInfo();
            info.setId(id);
            return info;
        }
        return null;
    }
    
}
