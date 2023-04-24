package com.hemebiotech.analytics;

import java.util.List;

/**
 * Anything that will read symptom data from a source.
 */
public interface ISymptomReader {
  /**
   * Fetch the symptoms as a list, or an empty list if none.
   * It is expected that this list may contain duplicate.
   * @return a list containing all found symptoms.
   */
  List<String> getSymptoms();
}
