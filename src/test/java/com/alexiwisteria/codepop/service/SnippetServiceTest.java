package com.alexiwisteria.codepop.service;

import com.alexiwisteria.codepop.model.Snippet;
import com.alexiwisteria.codepop.repository.SnippetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

/**
 * Unit tests for the {@link SnippetService} class.
 * <p>
 * This class verifies the core functionality of SnippetService by mocking its dependencies,
 * specifically the {@link SnippetRepository}, to isolate and test the service layer independently.
 * </p>
 *
 * @version 1.0
 * @see SnippetService
 * @see SnippetRepository
 */
@ExtendWith(MockitoExtension.class)
class SnippetServiceTest {

    @Mock
    private SnippetRepository snippetRepository;

    @InjectMocks
    private SnippetService snippetService;

    /**
     * Tests the {@link SnippetService#saveSnippet(Snippet)} method to ensure it correctly returns
     * a non-null Snippet object after saving it through the repository.
     * <p>
     * This test mocks the behavior of {@link SnippetRepository#save(Object)} and verifies
     * that the service layer interacts with the repository as expected.
     * </p>
     */
    @Test
    void saveSnippet_shouldReturnSnippet() {
        // Arrange: Create a new Snippet instance and define repository behavior
        Snippet snippet = new Snippet();
        snippet.setTitle("Sample Snippet");
        when(snippetRepository.save(snippet)).thenReturn(snippet);

        // Act: Call saveSnippet on SnippetService
        Snippet savedSnippet = snippetService.saveSnippet(snippet);

        // Assert: Ensure the returned Snippet object is not null
        assertNotNull(savedSnippet, "Saved snippet should not be null.");
    }

    // TODO: Add more tests to verify additional methods in SnippetService
}
