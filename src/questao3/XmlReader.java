package questao3;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

public class XmlReader {
    private static double[] valores = new double[30];

    public static double[] getValores() {
        return valores;
    }

    public static void lerXml(String caminho){
        try {
            // Caminho do arquivo XML
            File file = new File(caminho);

            // Criação do DocumentBuilderFactory e DocumentBuilder
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Parseia o arquivo XML para um documento DOM
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            // Obtém uma lista de todos os elementos <row>
            NodeList nodeList = doc.getElementsByTagName("row");

            // Itera sobre cada elemento <row> e armazena no vetor
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // Lê o valor de <dia> e <valor>
                    int dia = Integer.parseInt(element.getElementsByTagName("dia").item(0).getTextContent());
                    double valor = Double.parseDouble(element.getElementsByTagName("valor").item(0).getTextContent());

                    // Armazena o valor no índice correspondente ao dia
                    valores[dia - 1] = valor;  // dia - 1 porque o índice começa em 0
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

