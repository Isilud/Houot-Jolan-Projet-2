package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything the will write symptom data on a valid data output format.
 */
public interface ISymptomWriter {
  /**
   * Write the result on a data output.
   * @param symptoms The map of symptoms to write
   */
  public void writeSymptoms(Map<String, Integer> symptoms);
}
