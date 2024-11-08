package com.alexiwisteria.codepop.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the {@link Snippet} model class.
 * <p>
 * This class focuses on testing the getters and setters of the Snippet class,
 * ensuring that attributes are correctly assigned and retrieved.
 * </p>
 *
 * <p>
 * Note: This test assumes that the Snippet class follows standard getter and setter
 * conventions. If the class is modified to add validation or other logic in these
 * methods, this test may need updating.
 * </p>
 *
 * @version 1.0
 * @author
 */
class SnippetTest {

    /**
     * Tests the setter and getter methods of the Snippet class to verify
     * that the fields are properly set and retrieved.
     * <p>
     * This test checks each attribute individually to confirm data integrity
     * and avoid potential issues in case of future modifications.
     * </p>
     */
    @Test
    void testSnippetSettersAndGetters() {
        // Arrange: Initialize Snippet instance and set values
        Snippet snippet = new Snippet();
        snippet.setTitle("Example Title");
        snippet.setCode("System.out.println(\"Hello World\");");
        snippet.setLanguage("Java");

        // Assert: Verify that the values are correctly set and retrieved
        assertEquals("Example Title", snippet.getTitle(), "Title should match the set value.");
        assertEquals("System.out.println(\"Hello World\");", snippet.getCode(), "Code should match the set value.");
        assertEquals("Java", snippet.getLanguage(), "Language should match the set value.");
    }

    // TODO: Consider adding tests for validation logic, if implemented in Snippet class
}
