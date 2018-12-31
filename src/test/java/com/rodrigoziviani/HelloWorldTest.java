package com.rodrigoziviani;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @Test
    void sayHello() {
        assertThat(HelloWorld.sayHello()).isEqualTo("Hello World!");
    }

}