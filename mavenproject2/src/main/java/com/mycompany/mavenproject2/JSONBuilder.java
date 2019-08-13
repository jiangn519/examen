/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.Date;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author lin
 */
public class JSONBuilder {
       public String listeFormes() {
        JSONArray shapesList = new JSONArray();
        JSONObject singleShape = new JSONObject();
        singleShape.accumulate("name", "Circle");
        singleShape.accumulate("NumberofParam", 1);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Rectangle");
        singleShape.accumulate("NumberofParam", 2);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Trapezoid");
        singleShape.accumulate("NumberofParam", 3);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Triangle");
        singleShape.accumulate("NumberofParam", 2);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Sector");
        singleShape.accumulate("NumberofParam", 2);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Parallelogram");
        singleShape.accumulate("NumberofParam", 2);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Ellipse");
        singleShape.accumulate("NumberofParam", 2);
        shapesList.add(singleShape);
        singleShape.clear();
        singleShape.accumulate("name", "Rectangle");
        singleShape.accumulate("NumberofParam", 2);
        shapesList.add(singleShape);
        return shapesList.toString();
    }

// le code pourrait être optimisé pour éliminer le redandency dans le traitement et dans les IF
    public String formeTroisParam(String theName,
            double theParam1,
            double theParam2,
            double theParam3) throws NegativeValuesException {
        Date date = new Date();
        long unixTimeStamp = date.getTime();
        JSONObject areaShape = new JSONObject();
        areaShape.accumulate("Status", "Error");
        areaShape.accumulate("Timestamp", unixTimeStamp);
        areaShape.accumulate("Shape", theName.toUpperCase());
        areaShape.accumulate("Message", "Not the good Shape");
        double area;
        if (theName.toUpperCase().equals("TRAPEZOID")) {
            area = Shapes.computeAreaTrapezoid(theParam1,theParam2,theParam3);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("base1", theParam1);
            areaShape.accumulate("base2", theParam2);
            areaShape.accumulate("vertical", theParam3);
            areaShape.accumulate("area", area);
        }
        return areaShape.toString();
    }

    public String formeUnParam(String theName,
            double theParam1) throws NegativeValuesException {
        long unixTimeStamp = System.currentTimeMillis() / 1000L;
        JSONObject areaShape = new JSONObject();
        areaShape.accumulate("Status", "Error");
        areaShape.accumulate("Timestamp", unixTimeStamp);
        areaShape.accumulate("Shape", theName.toUpperCase());
        areaShape.accumulate("Message", "Not the good Shape");
        double area;
        if (theName.toUpperCase().equals("CIRCLE")) {
            area = Shapes.computeAreaCircle(theParam1);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("radius", theParam1);
            areaShape.accumulate("area", area);
        }
        if (theName.toUpperCase().equals("SQUARE")) {
            area = Shapes.computeAreaSquare(theParam1);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("side", theParam1);
            areaShape.accumulate("area", area);
        }
        return areaShape.toString();
    }

    public String formeDeuxParam(String theName,
            double theParam1,
            double theParam2) throws NegativeValuesException {
        Date date = new Date();
        long unixTimeStamp = date.getTime();
        JSONObject areaShape = new JSONObject();
        areaShape.accumulate("Status", "Error");
        areaShape.accumulate("Timestamp", unixTimeStamp);

        areaShape.accumulate("Shape", theName.toUpperCase());
        areaShape.accumulate("Message", "Not the good Shape");
        double area;
        if (theName.toUpperCase().equals("TRIANGLE")) {
            area = Shapes.computeAreaTriangle(theParam1, theParam2);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("base", theParam1);
            areaShape.accumulate("height", theParam2);
            areaShape.accumulate("area", area);
        }
        if (theName.toUpperCase().equals("RECTANGLE")) {
            area = Shapes.computeAreaRectangle(theParam1, theParam2);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("width", theParam1);
            areaShape.accumulate("height", theParam2);
            areaShape.accumulate("area", area);
        }
        if (theName.toUpperCase().equals("PARALLELOGRAM")) {
            area = Shapes.computeAreaParallelogram(theParam1, theParam2);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("base", theParam1);
            areaShape.accumulate("height", theParam2);
            areaShape.accumulate("area", area);
        }
        if (theName.toUpperCase().equals("ELLIPSE")) {
            area = Shapes.computeAreaEllipse(theParam1, theParam2);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("major", theParam1);
            areaShape.accumulate("minor", theParam2);
            areaShape.accumulate("area", area);
        }
        if (theName.toUpperCase().equals("SECTOR")) {
            area = Shapes.computeAreaSector(theParam1, theParam2);
            areaShape.clear();
            areaShape.accumulate("Status", "OK");
            areaShape.accumulate("Timestamp", unixTimeStamp);
            areaShape.accumulate("Shape", theName.toUpperCase());
            areaShape.accumulate("radius", theParam1);
            areaShape.accumulate("angle", theParam2);
            areaShape.accumulate("area", area);
        }
        return areaShape.toString();
    } 
}
