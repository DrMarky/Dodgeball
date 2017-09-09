package me.drmarky.dodgeball;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class DodgeballPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        logger.info(pdfFile.getName() + " has been enabled. (V." + pdfFile.getVersion() + ")");

        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        PluginDescriptionFile pdfFile = getDescription();
        Logger logger = getLogger();

        logger.info(pdfFile.getName() + " has been disabled. (V." + pdfFile.getVersion() + ")");
    }

    private void registerEvents() {
        PluginManager pm = getServer().getPluginManager();
        //pm.registerEvents(new InventoryClickListener(this), this);

    }

    private void registerCommands() {
        //getCommand("armor").setExecutor(new ArmorCommand(this));
    }
}
