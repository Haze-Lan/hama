package com.haodoings.hama;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HamaApplicationTest {

    @Test
    void main() {
        var modules = ApplicationModules.of(HamaApplication.class);
        modules.forEach(System.out::println);
    }
}