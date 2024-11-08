package com.alexiwisteria.codepop.repository;

import com.alexiwisteria.codepop.model.Snippet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Snippet} entities.
 * <p>
 * This interface provides CRUD operations for Snippet entities by extending
 * the {@link JpaRepository} interface, which offers built-in support for
 * common database operations.
 * </p>
 *
 * <p>
 * Additional custom query methods can be added here if specific queries are
 * required beyond the basic CRUD operations.
 * </p>
 *
 * @see JpaRepository
 * @see Snippet
 * @version 1.0
 */
public interface SnippetRepository extends JpaRepository<Snippet, Long> {
    // Custom query methods can be added here if needed
}
