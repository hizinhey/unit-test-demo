/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.http;

import com.mycompany.mavenproject2.constant.ErrorCode;
import com.mycompany.mavenproject2.database.DatabaseInterface;
import com.mycompany.mavenproject2.service.thrift.TServer;
import com.mycompany.mavenproject2.thrift.CategoryInfo;
import com.mycompany.mavenproject2.thrift.CategoryInfoResult;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author nghia
 */
public class CategoryTest {
    
    @Test
    public void GetInfo_WithoutId_ReturnFalse(){
        String id = null;
        
        DatabaseInterface mockDatabase = mock(DatabaseInterface.class);
        TServer tServer = new TServer(mockDatabase);
        
        when(mockDatabase.getInfo(Mockito.anyString())).thenReturn(null);
        
        CategoryInfoResult result = tServer.getInfo(id); // id = null
        
        Assert.assertSame("GetInfo without Id", ErrorCode.FAIL, result.error);
    };
}
