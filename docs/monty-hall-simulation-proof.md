# Monty Hall Simulation Proof

The [Monty Hall problem](https://en.wikipedia.org/wiki/Monty_Hall_problem) is a statistical puzzle based on the game show "Let's Make a Deal".

In the show, the host presents a contestant with three doors. Behind one door is a car, but behind each of the others there is a goat.  As a contestant, you pick a door. The host then opens a different door and reveals a goat. You are then given the choice of sticking with your original choice or switching to the unopened door.

The "problem" is: what's the best strategy -- should you switch or not?

It turns out that you are twice as likely to win by switching doors than by staying put (2/3 vs 1/3). This conclusion was disbelieved by many people for several years. Allegedly, Paul Erdős, a renowned mathematician, remained unconvinced until he was shown a computer simulation.

## Tasks

1. Determine the best strategy in the Monty Hall problem by implementing the `simulate` function in [src/katas/monty_hall/core.clj](../src/katas/monty_hall/core.clj).

   Simulate at least 1000 games using each strategy (stay-with-original-door and switch-doors) and compare the winning percentages.

   Try to write code as you would expect from your coworkers on a non-trivial production project.

2. After you're done, look over your code and consider:

   a. which parts of your code are stateful and which are pure?

   b. how might you need to change your code to test that it is working correctly?

3. If you’d like to have us discuss your solution and compare it to others, please push your code and add a link to your repo to [this spreadsheet](https://docs.google.com/spreadsheets/d/1JwO53TlIj367CTodutJNvESWis0tIk4RJH8AiZoPsqs/edit?usp=sharing).

<br>
<br>
<br>
<hr>
<sup>This kata is based on [the Monty Hall Kata in the Coding Dojo Handbook](https://leanpub.com/codingdojohandbook)</sup>
