package com.alexiwisteria.codepop.service;

import com.alexiwisteria.codepop.model.Snippet;
import com.alexiwisteria.codepop.repository.SnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing {@link Snippet} entities.
 * <p>
 * This service provides methods for creating, retrieving, and deleting snippets.
 * It acts as an intermediary between the controller and the repository layers,
 * containing business logic for snippet-related operations.
 * </p>
 *
 * @version 1.0
 * @see Snippet
 * @see SnippetRepository
 */
@Service
public class SnippetService {

    private final SnippetRepository snippetRepository;

    /**
     * Constructs a {@link SnippetService} with the necessary repository dependency.
     *
     * @param snippetRepository the repository used for snippet data access
     */
    @Autowired
    public SnippetService(SnippetRepository snippetRepository) {
        this.snippetRepository = snippetRepository;
    }

    /**
     * Saves a new or existing snippet to the repository.
     *
     * @param snippet the snippet to save
     * @return the saved snippet, including any generated fields like ID
     */
    public Snippet saveSnippet(Snippet snippet) {
        return snippetRepository.save(snippet);
    }

    /**
     * Retrieves a snippet by its unique ID.
     *
     * @param id the ID of the snippet to retrieve
     * @return an {@link Optional} containing the snippet if found, or empty if not
     */
    public Optional<Snippet> getSnippet(Long id) {
        return snippetRepository.findById(id);
    }

    /**
     * Retrieves all snippets from the repository.
     *
     * @return a list of all snippets
     */
    public List<Snippet> getAllSnippets() {
        return snippetRepository.findAll();
    }

    /**
     * Deletes a snippet by its unique ID.
     * <p>
     * If no snippet exists with the specified ID, this operation will be a no-op.
     * </p>
     *
     * @param id the ID of the snippet to delete
     */
    public void deleteSnippet(Long id) {
        snippetRepository.deleteById(id);
    }
}
