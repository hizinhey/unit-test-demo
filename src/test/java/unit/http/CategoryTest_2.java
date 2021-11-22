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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nghia
 */
public class CategoryTest_2 {

    @Test
    public void GetInfo_GetInfoWithId1_ReturnTrue() {
        String id = "1";

        DatabaseInterface mockDatabase = mock(DatabaseInterface.class);
        TServer tServer = new TServer(mockDatabase);

        when(mockDatabase.getInfo(Mockito.anyString())).thenReturn(new CategoryInfo());

        CategoryInfoResult result = tServer.getInfo(id); // id = null

        Assert.assertSame("GetInfo with id 1", ErrorCode.SUCCESS, result.error);
    }
;
}
