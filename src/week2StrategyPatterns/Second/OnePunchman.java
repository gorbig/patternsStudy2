package week2StrategyPatterns.Second;

public class OnePunchman implements Anime {

    @Override
    public void name() {
        System.out.println("OnePunchman");
    }

    @Override
    public void author() {
        System.out.println("Yusuke Murata");
    }

    @Override
    public void description() {
        System.out.println("These are hard times for mankind, as various monsters from outer space, the bowels of the Earth, science labs and God knows where else have descended upon Mother Earth as if it were their own home. Consistently destroying one city after another, they bring death and destruction, instilling awe in the hearts of onlookers. However, the onlookers have nothing to fear other than getting blindsided by a random assassin, as our protagonist, a bald young man named Saitama, has a longing expression on his face.\n" +
                "\n" +
                "You are not fooled by his not particularly heroic appearance: Saitama, though lacking in hair, a cool suit, and the requisite stock of big-boy-speak for a savior of the universe, is incredibly strong. Three years ago he lost his job and decided to become a hero, so much so that he overtrained and now defeats any monster with a single punch. But why then is he so despondent and dissatisfied with life? Because the best heroes are dejected when they have no strong enemies, but no one can hold their own against Saitama. So he is not happy with his many victories, nor with the respect of his new \"apprentice\", nor with his peers - just hope that somewhere along the line, worthy opponents await him");
    }
}
