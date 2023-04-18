package icehighway;

// import com.example.addon.commands.CommandExample;
// import com.example.addon.hud.HudExample;
// import com.example.addon.modules.ModuleExample;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
// import meteordevelopment.meteorclient.systems.commands.Commands;
// import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
// import meteordevelopment.meteorclient.systems.modules.world.IceHighwayBuilder;
import icehighway.modules.IceHighwayBuilder;

import org.slf4j.Logger;

public class IceHighwayAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("IceHighway CATEGORY");
    public static final HudGroup HUD_GROUP = new HudGroup("IceHighway HUD_GROUP");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon IceHighway");

        // Modules
        Modules.get().add(new IceHighwayBuilder());

        // Commands
        // Commands.get().add(new CommandExample());

        // HUD
        // Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "icehighway";
    }
}
