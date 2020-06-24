# Mars Rovers

NASA is sending a squad of robotic rovers to survey a curiously rectangular plateau on Mars.

Each rover understands a limited set of commands:
 - `M` for move forward
 - `R` to rotate 90 degrees right
 - `L` to rotate 90 degrees left

In order to control a rover, NASA sends a list of commands, such as: `M M R M` (move forward, move forward, rotate right, move forward). (In Clojure, we will represent these as: `[:M :M :R :M]`)

A rover's position and location are represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points, for example: `[0 0 :N]`.

A plateau is rectangular and defined by its top-right coordinates (ex. `[5 4]`), meaning, 5-wide, 4-high. `[0 0]` can be assumed to be the bottom-left coordinate.

Rovers can coexist on a location.

If a rover is given a command that would move it past the boundaries of a plateau, it should ignore that command.

For a given plateau and set of rovers (each with a starting position and direction, and a set of commands), we want to know where each of the rovers will end up.

You've inherited some working object-oriented code from the prototype team (see [resources/mars_rovers/ruby](../resources/mars_rovers/ruby)), but the current project lead is curious to try functional programming and see what benefits it might bring to the application.

An attempt at rewriting the prototype in Clojure, but keeping it OOP, resulted in the code in [src/katas/mars_rovers/oop.clj](../src/katas/mars_rovers/oop.clj). Apparently, this isn't an "idiomatic" way to solve the problem in Clojure.

## Tasks

1. Take a moment to go through the existing code (either [the Ruby version](../resources/mars_rovers/ruby) or [the Clojure version](../src/katas/mars_rovers/oop.clj)) and identify:
   - places where state is defined
   - places where state is referenced
   - places where state is mutated
   - places where other side-effects are triggered
   - which functions are pure and which aren’t

   If you'd like, you can "Make a Copy" or download [this Google Doc](https://docs.google.com/document/d/1S22-Qk_II36Kt8HZ35Zz-0EUlldcqRwb2X1nJqd16lM/edit) and highlight the above categories using different colours.

2. Reimplement the Mars Rovers functionality in Clojure.

   There is some starter code at [src/katas/mars_rovers/core.clj](../src/katas/mars_rovers/core.clj)

   Some tests for the main entry point are ready for you in [test/katas/test/mars_rovers.clj](../test/katas/test/mars_rovers.clj)

   Try to write code as you would expect from your coworkers on a non-trivial production project.

3. When you’re done, as we did at the start, take a moment to go through your solution and identify:
   - places where state is defined
   - places where state is referenced
   - places where state is mutated
   - places where other side-effects are triggered
   - which functions are pure and which aren’t

4. If you’d like to have us discuss your solution and compare it to others, please push your code and add a link to your repo to [this spreadsheet](https://docs.google.com/spreadsheets/d/1JwO53TlIj367CTodutJNvESWis0tIk4RJH8AiZoPsqs/edit?usp=sharing).

<br>
<br>
<br>
<hr>
<sup>This kata is based on an interview question from ThoughtWorks</sup>
