public class PlanetTester
{
    public static void main(String[] args)
    {
        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet uranus = new Planet("Uranus");
        Planet neptune = new Planet("Neptune");
        Planet pluto = new Planet("Pluto");

        Planet[] solarSystemPlanets = new Planet[9];
        solarSystemPlanets[0] = mercury;
        solarSystemPlanets[1] = venus;
        solarSystemPlanets[2] = earth;
        solarSystemPlanets[3] = mars;
        solarSystemPlanets[4] = jupiter;
        solarSystemPlanets[5] = saturn;
        solarSystemPlanets[6] = uranus;
        solarSystemPlanets[7] = neptune;
        solarSystemPlanets[8] = pluto;

        printPlanet(solarSystemPlanets);

    }

    private static void printPlanet(Planet[] Planet)
    {
        for (Planet planet : Planet)
        {
            System.out.println(planet.getName());
        }
    }
}
