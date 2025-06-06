package exogenesis.world;

import arc.graphics.Color;
import mindustry.game.Team;

public class ExoTeams {
    //Credits to Slotterfleet / team oct as I heavily referenced that (I also tooka big chunk for the icon loading)
    public static Team empyrean, geoComplex, legion, gaiaProtocol;

    public static void load() {
        empyrean = newTeam(20, "empyrean", Color.valueOf("ffce3b"));
        geoComplex = newTeam(4, "geoComplex", Color.valueOf("ec4248"));
        legion = newTeam(5, "legion", Color.valueOf("5490ec"));
        gaiaProtocol = newTeam(73, "gaiaProtocol", Color.valueOf("24d049"));
    }
    private static Team newTeam(int id, String name, Color color) {Team team = Team.get(id);
        team.name = name;
        team.color.set(color);

        team.palette[0] = color;
        team.palette[1] = color.cpy().mul(0.75f);
        team.palette[2] = color.cpy().mul(0.5f);

        for(int i = 0; i < 3; i++){
            team.palettei[i] = team.palette[i].rgba();
        }
        return team;
    }

}