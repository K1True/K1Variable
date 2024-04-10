package org.atk1true.k1variable;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class K1Variable extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        say("the plugin has been installed");
        say("§6你好");
        CommandExecutor commandExecutor1 = new TestUsage();
        CommandExecutor commandExecutor2 = new CommandCreate();
        this.getCommand("kv").setExecutor(commandExecutor2);
        this.getCommand("test").setExecutor(commandExecutor2);
        this.getCommand("testuse").setExecutor(commandExecutor1);
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        say("the plugin has been uninstalled");
    }
    public void say(String s){
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(s);
    }
}
