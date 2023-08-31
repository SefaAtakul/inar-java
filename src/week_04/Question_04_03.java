package week_04;

public class Question_04_03 {
    public static void main(String[] args) {
        //Geography:estimate areas//
        final double radius = 6371.01;
        //define the points of cities//
        double georgiaAtalantaY = Math.toRadians(-84.3879824);
        double georgiaAtalantaX = Math.toRadians(33.7489954);
        double orlandoFloridaY = Math.toRadians(-81.3792364999);
        double orlandoFloridaX = Math.toRadians(28.5383355);
        double savannahGeorgiaY = Math.toRadians(-81.09983419999998);
        double savannahGeorgiaX = Math.toRadians(32.0835407);
        double charlotteNorthCarolineX = Math.toRadians( -80.84312669999997);
        double charlotteNorthCarolineY = Math.toRadians(35.2270869);
        //Distance between cities
        double distanceGeorgiaOrlando = radius * Math.acos(Math.sin(georgiaAtalantaX) * Math.sin(orlandoFloridaX) + Math.cos(georgiaAtalantaX) * Math.cos(orlandoFloridaX) * Math.cos(georgiaAtalantaY - orlandoFloridaY));
        double distanceOrlandoSavannah = radius * Math.acos(Math.sin(orlandoFloridaX) * Math.sin(savannahGeorgiaX) + Math.cos(orlandoFloridaX) * Math.cos(savannahGeorgiaX) * Math.cos(orlandoFloridaX - savannahGeorgiaX));
        double distanceSavannahCharlotte = radius * Math.acos(Math.sin(savannahGeorgiaX) * Math.sin(charlotteNorthCarolineX) + Math.cos(savannahGeorgiaX) * Math.cos(charlotteNorthCarolineX) * Math.cos(savannahGeorgiaY - charlotteNorthCarolineY));
        double distanceCharlotteGeorgia = radius * Math.acos(Math.sin(charlotteNorthCarolineX) * Math.sin(georgiaAtalantaX) + Math.cos(charlotteNorthCarolineX) * Math.cos(georgiaAtalantaX) * Math.cos(charlotteNorthCarolineY - georgiaAtalantaY));
        double distanceSavannahAtlanta = radius * Math.acos(Math.sin(savannahGeorgiaX) * Math.sin(georgiaAtalantaX) + Math.cos(savannahGeorgiaX) * Math.cos(georgiaAtalantaX) * Math.cos(savannahGeorgiaY - georgiaAtalantaY));
        //Divide Polygon into triangles and find the area
        double side1 = (distanceGeorgiaOrlando + distanceOrlandoSavannah + distanceSavannahAtlanta) / 2;
        double side2 = (distanceSavannahCharlotte + distanceCharlotteGeorgia + distanceSavannahAtlanta) / 2;
        //Calculate the area
        double area1 = Math.sqrt(side1 * (side1 - distanceGeorgiaOrlando) * (side1 - distanceOrlandoSavannah) * (side1 - distanceSavannahAtlanta));
        double area2 = Math.sqrt(side2 * (side2 - distanceSavannahCharlotte) * (side2 - distanceCharlotteGeorgia) * (side2 - distanceSavannahAtlanta));
        //Display the polygon's area
        System.out.println("Estimated area enclosed by these four cities : " + area1 + area2);

    }

}
