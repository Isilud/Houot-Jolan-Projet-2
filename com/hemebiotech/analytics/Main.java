package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

  /**
   * The entry of our program.
   * Set up the given reader/writer,
   * fetch the symptoms, process the data and print out the result
   * @author Jolan
   */
  public static void main(String[] args) {

    ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
    ISymptomWriter writer = new WriteSymptomDataToFile();
    AnalyticsCounter counter = new AnalyticsCounter(reader, writer);

    counter.writeSymptoms(counter.sortSymptoms(counter.countSymptoms(counter.getSymptoms())));
  }
}