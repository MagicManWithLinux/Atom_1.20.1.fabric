package com.lset.atom.common.command;

import com.lset.atom.ui.LVL_Interface;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class ModCommands {
    public static void register(CommandDispatcher<ServerCommandSource>dispatcher){
        dispatcher.register(
        LiteralArgumentBuilder.<ServerCommandSource>literal("open-example")
            .executes(Context ->{
            // Получаем игрока
            ServerPlayerEntity player = Context.getSource().getPlayerOrThrow();

            MinecraftClient.getInstance().execute(() ->{
                MinecraftClient.getInstance().setScreen(new LVL_Interface());
            });

            // Отправка сообщения игроку
            player.sendMessage(Text.literal("открытие GUI..."),false);

        return 1;
        }));
    }
}
