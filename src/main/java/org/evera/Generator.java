package org.evera;

import org.evera.tailwindcss.CssUtilityParser;

import java.io.IOException;
import java.util.Map;

public class Generator {
    public static void main(String[] args) throws IOException {
        Map<String, Map<String, String>> map = CssUtilityParser.parse("{\n" +
                "        '.content-center': {\n" +
                "          'align-content': 'center',\n" +
                "        },\n" +
                "        '.content-start': {\n" +
                "          'align-content': 'flex-start',\n" +
                "        },\n" +
                "        '.content-end': {\n" +
                "          'align-content': 'flex-end',\n" +
                "        },\n" +
                "        '.content-between': {\n" +
                "          'align-content': 'space-between',\n" +
                "        },\n" +
                "        '.content-around': {\n" +
                "          'align-content': 'space-around',\n" +
                "        },\n" +
                "      }");

        System.out.println(map);
    }
}
