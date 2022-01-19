package me.ionar.salhack.module.chat;

import me.ionar.salhack.module.Module;

import java.util.Random;

public class PopBobSexDupeModule extends Module {

    public PopBobSexDupeModule()
    {
        super("PopBobSexDupe", new String[]
                        { "PopBobSexDupe" }, "Have sexual intercorse with PopBob for items to dupe.", "NONE",
                0xDB2485, Module.ModuleType.CHAT);
    }

    @Override
    public void onEnable() {
        if(mc.player != null)
            mc.player.sendChatMessage("I just performed the PopBob sex dupe and got " +  (new Random().nextInt(30) + 1) + " shulkers!");
        toggle();
    }
}
