package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

  private ISymptomReader reader;
  private ISymptomWriter writer;

  public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
    this.reader = reader;
    this.writer = writer;
  }

  /** 
  * Fetch the symptoms list.
  * @author Jolan
  * @return symptoms as list of string
  */
  public List<String> getSymptoms() {
    return this.reader.getSymptoms();
  }

  /** 
  * Count the symptoms.
  * @author Jolan
  * @param symptoms The list of symptoms to count
  * @return a map with the symptoms name as key and the count as value
  */
  public Map<String, Integer> countSymptoms(List<String> symptoms) {
    Map<String, Integer> symptomCount = new HashMap<String, Integer>();

    for (String symptom : symptoms) {
      if (symptomCount.containsKey(symptom)) {
        symptomCount.put(symptom, symptomCount.get(symptom) + 1);
      } else {
        symptomCount.put(symptom, 1);
      }
    }

    return symptomCount;
  }

  /** 
  * Sort the symptoms by name.
  * @author Jolan
  * @param symptoms A map with the symptoms name as key
  * @return the map sorted by symptoms name
  */
  public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
    return new TreeMap<String, Integer>(symptoms);
  }

  /** 
  * Write result.
  * @author Jolan
  * @param symptoms A map with the symptoms name as key and the count as value.
  */
  public void writeSymptoms(Map<String, Integer> symptoms) {
    this.writer.writeSymptoms(symptoms);
  }
}
