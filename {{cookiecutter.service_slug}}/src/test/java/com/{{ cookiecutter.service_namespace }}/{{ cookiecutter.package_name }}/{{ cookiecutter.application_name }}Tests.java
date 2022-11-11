package com.{{ cookiecutter.service_namespace }}.{{ cookiecutter.package_name }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class {{ cookiecutter.application_name }}Tests {

    @Test
    void contextLoads() {
    }

}
