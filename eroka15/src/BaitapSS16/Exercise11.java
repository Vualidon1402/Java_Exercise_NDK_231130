package BaitapSS16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Team {
    private String name;
    private int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Team A", 20));
        teams.add(new Team("Team B", 15));
        teams.add(new Team("Team C", 25));
        teams.add(new Team("Team D", 10));

        sortByPoints(teams);
        System.out.println("Sắp xếp bằng Collections.sort() với Comparator:");
        printTeams(teams);

        bubbleSort(teams);
        System.out.println("Sắp xếp bằng Bubble Sort:");
        printTeams(teams);

        insertionSort(teams);
        System.out.println("Sắp xếp bằng Insertion Sort:");
        printTeams(teams);
    }

    private static void sortByPoints(List<Team> teams) {
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team team1, Team team2) {
                return Integer.compare(team2.getPoints(), team1.getPoints());
            }
        });
    }

    private static void bubbleSort(List<Team> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getPoints() < teams.get(j + 1).getPoints()) {
                    Collections.swap(teams, j, j + 1);
                }
            }
        }
    }

    private static void insertionSort(List<Team> teams) {
        int n = teams.size();
        for (int i = 1; i < n; ++i) {
            Team key = teams.get(i);
            int j = i - 1;

            while (j >= 0 && teams.get(j).getPoints() < key.getPoints()) {
                teams.set(j + 1, teams.get(j));
                j = j - 1;
            }
            teams.set(j + 1, key);
        }
    }

    private static void printTeams(List<Team> teams) {
        for (Team team : teams) {
            System.out.println(team);
        }
    }
}
