
package mage.cards.d;

import java.util.UUID;
import mage.abilities.triggers.BeginningOfEndStepTriggeredAbility;
import mage.abilities.condition.common.MorbidCondition;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.hint.common.MorbidHint;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.AbilityWord;
import mage.constants.CardType;
import mage.constants.TargetController;

/**
 *
 * @author fireshoes
 */
public final class DeathreapRitual extends CardImpl {

    public DeathreapRitual(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ENCHANTMENT},"{2}{B}{G}");

        // <i>Morbid</i> &mdash; At the beginning of each end step, if a creature died this turn, you may draw a card.
        this.addAbility(new BeginningOfEndStepTriggeredAbility(TargetController.ANY, new DrawCardSourceControllerEffect(1),
                true, MorbidCondition.instance).addHint(MorbidHint.instance).setAbilityWord(AbilityWord.MORBID));
    }

    private DeathreapRitual(final DeathreapRitual card) {
        super(card);
    }

    @Override
    public DeathreapRitual copy() {
        return new DeathreapRitual(this);
    }
}
