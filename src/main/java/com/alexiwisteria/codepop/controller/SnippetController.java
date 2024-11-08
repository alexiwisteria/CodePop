package com.alexiwisteria.codepop.controller;

import com.alexiwisteria.codepop.model.Snippet;
import com.alexiwisteria.codepop.service.SnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Snippets.
 * <p>
 * This controller provides endpoints for creating, retrieving, and deleting
 * code snippets. It acts as the entry point for handling HTTP requests related to snippets
 * and delegates the operations to {@link SnippetService}.
 * </p>
 *
 * @version 1.0
 * @see SnippetService
 */
@RestController
@RequestMapping("/api/snippets")
public class SnippetController {

    private final SnippetService snippetService;

    /**
     * Constructor for {@link SnippetController}, autowiring the required {@link SnippetService}.
     *
     * @param snippetService the service to handle snippet-related operations
     */
    @Autowired
    public SnippetController(SnippetService snippetService) {
        this.snippetService = snippetService;
    }

    /**
     * Creates a new snippet.
     * <p>
     * This endpoint accepts a Snippet object in the request body and saves it via
     * {@link SnippetService}. The created Snippet is returned in the response.
     * </p>
     *
     * @param snippet the snippet to be created
     * @return the created snippet
     */
    @PostMapping
    public Snippet createSnippet(@RequestBody Snippet snippet) {
        return snippetService.saveSnippet(snippet);
    }

    /**
     * Retrieves a snippet by its ID.
     * <p>
     * This endpoint fetches a snippet based on the provided ID. If found, the snippet
     * is returned as an Optional; otherwise, an empty Optional is returned.
     * </p>
     *
     * @param id the ID of the snippet to retrieve
     * @return an Optional containing the snippet if found, otherwise empty
     */
    @GetMapping("/{id}")
    public Optional<Snippet> getSnippet(@PathVariable Long id) {
        return snippetService.getSnippet(id);
    }

    /**
     * Retrieves all snippets.
     * <p>
     * This endpoint returns a list of all available snippets.
     * </p>
     *
     * @return a list of all snippets
     */
    @GetMapping
    public List<Snippet> getAllSnippets() {
        return snippetService.getAllSnippets();
    }

    /**
     * Deletes a snippet by its ID.
     * <p>
     * This endpoint deletes the snippet associated with the given ID. No response
     * body is returned on successful deletion.
     * </p>
     *
     * @param id the ID of the snippet to delete
     */
    @DeleteMapping("/{id}")
    public void deleteSnippet(@PathVariable Long id) {
        snippetService.deleteSnippet(id);
    }
}
