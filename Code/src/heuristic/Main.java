package heuristic;

import heuristic.algorithm.IG;
import heuristic.algorithm.IAlgorithm;
import heuristic.constructive.GIP;
import heuristic.localSearch.*;
import heuristic.structure.Instance;
import heuristic.structure.RandomManager;
import heuristic.structure.Result;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    final static String pathFolder = "./Instances";

    final static boolean readAllFolders = false;
    final static boolean readAllInstances = true;

    final static String folderIndex = "grInstances";
    final static String instanceIndex = "astro-ph.txt";

    static List<String> foldersNames;
    static List<String> instancesNames;
    static String instanceFolderPath;

    static IAlgorithm algorithm;
    static GIP constructive=new GIP();
    static LocalSearchEfficient_1_1 localSearchEfficient_1_1=new LocalSearchEfficient_1_1();

    public static void main(String[] args) {
        algorithm=new IG(constructive, localSearchEfficient_1_1);
        execute();
    }

    private static void execute()  {
        File file=new File(pathFolder);
        instanceFolderPath = file.getPath() + "/";
        readInstance("/dev/stdin");
    }

    private static void readInstance(String instancePath){
        System.err.println(instancePath);
        Instance instance=new Instance(instancePath);
        RandomManager.setSeed(13);
        Result result= algorithm.execute(instance,false);
    }

}
