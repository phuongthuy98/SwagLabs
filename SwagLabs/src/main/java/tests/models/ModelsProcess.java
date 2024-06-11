package tests.models;

import com.opencsv.bean.CsvToBeanBuilder;
import common.Utils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ModelsProcess {
    public Register convertRegisterFromCsv(String fileName) {
        Register register = new Register();

        Utils utils = new Utils();
        String registerDataPath = System.getProperty("user.dir") + "/testdata/" + fileName;
        try {
            List<Register> registers = new CsvToBeanBuilder<Register>(new FileReader(registerDataPath)).withType(Register.class)
                    .build().parse();
            register =registers.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return register;
    }
}
