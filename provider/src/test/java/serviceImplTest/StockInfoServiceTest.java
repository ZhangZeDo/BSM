package serviceImplTest;

import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import com.hltj.api.service.StockInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzedong
 * @version 1.0
 * @date 2021/3/7 9:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StockInfoServiceTest {
    @Resource
    private StockInfoService stockInfoService;


    @Test
    public void Test(){
        File file = new File("C://Users//ZHANG//Desktop//港股打新统计分析表.xlsx");
        //stockInfoService.batchInsertFromFile(file,"admin");
    }
}
