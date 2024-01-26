package net.swofty.types.generic.gui.inventory.inventories.sbmenu.skills;

import net.minestom.server.event.inventory.InventoryCloseEvent;
import net.minestom.server.event.inventory.InventoryPreClickEvent;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.inventory.InventoryType;
import net.swofty.types.generic.gui.inventory.SkyBlockInventoryGUI;
import net.swofty.types.generic.skill.SkillCategories;
import net.swofty.types.generic.user.SkyBlockPlayer;

public class GUISkillCategory extends SkyBlockInventoryGUI {
    public GUISkillCategory(SkillCategories category) {
        super(category.toString(), InventoryType.CHEST_6_ROW);
    }

    @Override
    public boolean allowHotkeying() {
        return false;
    }

    @Override
    public void onClose(InventoryCloseEvent e, CloseReason reason) {

    }

    @Override
    public void suddenlyQuit(Inventory inventory, SkyBlockPlayer player) {

    }

    @Override
    public void onBottomClick(InventoryPreClickEvent e) {

    }
}