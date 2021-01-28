package io.gonzo.jpa.app.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloResource.class)
class HelloResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("헬로우")
    public void getByHello() throws Exception {
        mockMvc.perform(get("/api/hello/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("success"));
    }

}
