package com.lset.atom.common.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
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

            // Отправка сообщения игроку
            player.sendMessage(Text.literal("открытие GUI..."),false);

        return 1;
        }));
    }
}
