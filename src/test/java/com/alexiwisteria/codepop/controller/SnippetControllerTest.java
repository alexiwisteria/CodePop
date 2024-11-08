package com.alexiwisteria.codepop.controller;

import com.alexiwisteria.codepop.model.Snippet;
import com.alexiwisteria.codepop.service.SnippetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Unit tests for {@link SnippetController}.
 * <p>
 * This class tests the functionality of the SnippetController's endpoints,
 * using MockMvc for simulating HTTP requests and verifying responses.
 * </p>
 *
 * <p>
 * Since this is a web layer test, only the SnippetController is loaded into
 * the context. Other layers, such as services, are mocked to isolate the
 * controller layer.
 * </p>
 *
 * @author [Your Name]
 * @version 1.0
 */
@WebMvcTest(SnippetController.class)
class SnippetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SnippetService snippetService;

    /**
     * Tests the <code>GET /api/snippets/1</code> endpoint, ensuring that it returns
     * a status of OK (200) if the request is successful.
     * <p>
     * This test verifies that the endpoint exists and is properly configured to
     * respond with an OK status. The actual service logic is mocked, focusing
     * on the controller's responsibility.
     * </p>
     *
     * @throws Exception if an error occurs during request execution
     */
    @Test
    void getSnippet_shouldReturnStatusOk() throws Exception {
        mockMvc.perform(get("/api/snippets/1"))
                .andExpect(status().isOk());
    }

    // TODO: Add more tests to cover additional endpoints and edge cases.
}
