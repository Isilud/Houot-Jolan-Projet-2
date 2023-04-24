package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

  private static String path = "result.out";

  @Override
  public void writeSymptoms(Map<String, Integer> symptoms) {

    try {
      FileWriter fileWriter = new FileWriter(path, false);

      for (Map.Entry<String, Integer> symptomData : symptoms.entrySet()) {
        fileWriter.write(symptomData.getKey() + " : " + symptomData.getValue() + "\n");
      }

      fileWriter.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}