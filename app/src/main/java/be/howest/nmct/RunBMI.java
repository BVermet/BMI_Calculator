package be.howest.nmct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Created by Bryan on 13/02/2015.
 */
public class RunBMI {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter(System.out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        pw.println("Wat is uw lengte? (uitdrukken in m aub)");
        pw.flush();
        float lengte = Float.parseFloat(br.readLine());

        pw.println("Wat is uw huidige gewicht? (uitdrukken in kg aub)");
        pw.flush();
        int gewicht = Integer.parseInt(br.readLine());

        BMIInfo BMI = new BMIInfo();
        BMI.setHeight(lengte);
        BMI.setMass(gewicht);
        System.out.println(BMI.toString());

    }


}
