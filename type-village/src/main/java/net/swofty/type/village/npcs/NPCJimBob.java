package net.swofty.type.village.npcs;

import net.minestom.server.coordinate.Pos;
import net.swofty.types.generic.entity.npc.NPCParameters;
import net.swofty.types.generic.entity.npc.SkyBlockNPC;

public class NPCJimBob extends SkyBlockNPC {

    public NPCJimBob() {
        super(new NPCParameters() {
            @Override
            public String[] holograms() {
                return new String[]{"§9Jim Bob", "§e§lCLICK"};
            }

            @Override
            public String signature() {
                return "ZHETGYrzWXIOz/gbS7xRw0cKUORtUq+RI3ZsNoOJO1/wdlENkZFycgM9tJuDPTmB5bWMsQz7nZn8Gm/3UvvLoieLKrPXXLrEpccznRhXVZpFsa0ceBOpKNwmQ+jJ4zURhR5Qez5F7+gLQNpUsMJnFADHa6LDPIrA/8ZgNPKyomF7xmZVKSq+h+Nxv/myczRtV/PDKC3etTg4AEVm1NyTm5hvmK9DUYsiVA7HKPgPpdqp0/Tl8gw3rJWfa8laVFP2VGMDCG+UNbgpBPrFUNTBuuyZA4UKh9AJFs08qrEEmfykV3xjGOMlo7ZoRuslytnwPPMlff0yZw79nTd6xdKRyNC4E5jZsHxXnDU532D/P2rjRdTow9yECbcj7VuUkezJc4wCBqjfC91Zj6dZUHlyJtkSTwGX73eac35BXHCFaYGUmLREZTJ/JjJ/MINyepgkbo7utML0vS2bWO4vyjg4SicVBBbrmv0k3GhxlFRzkPuS4tbs3VCqy84qfLdIGixQpqttL3MiTjE8dgAsFCO7S6gqNnik0zEU4cShH72+3gHIP+GRIasL6E2SOHwIsNcAWl9ampF4Ecsl+YvEREJ4Oo1aSnzi4g6GLQN5ZQM7wn/5kmzD+kiMqqer9TCIeXHVinCI3tAQzf4cvb3ILiBuROzbEdrYhUqFv9jAXEqaclo=";
            }

            @Override
            public String texture() {
                return "ewogICJ0aW1lc3RhbXAiIDogMTY4OTAyMTY0ODE1MiwKICAicHJvZmlsZUlkIiA6ICJmYzg3ZTI3YTYwZjY0NjdhOGMwMDgyMmI2ZWY5ZTMyNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJhbmRyZWlvX28iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTUyN2ZiMzA2OTBkMGJlZTJiYzcxYzVmOWY3MWNkZjBlOThkZTlhYjliYjQ3YmM4Mzg3YTE3ODc1MjliNjkyNiIKICAgIH0KICB9Cn0=";
            }

            @Override
            public Pos position() {
                return new Pos(65.5, 71, -61.5, -90, 0);
            }

            @Override
            public boolean looking() {
                return true;
            }
        });
    }

    @Override
    public void onClick(PlayerClickNPCEvent e) {
        e.player().sendMessage("§cThis Feature is not there yet. §aOpen a Pull request at https://github.com/Swofty-Developments/HypixelSkyBlock to get it added quickly!");
    }

}
