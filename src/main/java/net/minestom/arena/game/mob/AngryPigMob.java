package net.minestom.arena.game.mob;

import net.minestom.server.entity.EntityType;
import net.minestom.server.entity.Player;
import net.minestom.server.entity.ai.goal.MeleeAttackGoal;
import net.minestom.server.entity.ai.target.ClosestEntityTarget;
import net.minestom.server.utils.time.TimeUnit;

import java.util.List;

public final class AngryPigMob extends ArenaMob {

    public AngryPigMob(MobGenerationContext context) {
        super(EntityType.PIG, context);
        addAIGroup(
                List.of(new MeleeAttackGoal(this, 1.2, 2, TimeUnit.SERVER_TICK)),
                List.of(new ClosestEntityTarget(this, 32, entity -> entity instanceof Player))
        );
    }
}
