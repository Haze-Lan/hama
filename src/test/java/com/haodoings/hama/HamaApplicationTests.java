package com.haodoings.hama;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

@SpringBootTest
class HamaApplicationTests {

    @Test
    void contextLoads() {
        ApplicationModules modules = ApplicationModules.of(HamaApplication.class);
        modules.forEach(System.out::println);
    }
    @Test
    void writeDocumentationSnippets() {
        ApplicationModules modules = ApplicationModules.of(HamaApplication.class);
        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }

}
