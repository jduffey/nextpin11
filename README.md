Revised 8/4/2018.

This is a hobby project with the goal of creating a type of 2FA solution.

A square-shaped pinpad of an arbitray odd-sized number N is generated and populated with the values of 0 to N. The order of the numbers is then randomly shuffled. 

The customer chooses two values that are kept private; these are the 'Anchor Number' and 'Direction Number'. (These numbers can be thought of the equivalent of a private key.)

The customer is then presented with the pinpad. Finding the Anchor Number, she then "navigates" to the Direction Number, keeping mental note of "how she got there". Importantly, the pinpad allows for "wraparound" movement meaning that (for example) a number on the right-hand border can "move right" one place to "end up at" the first element in that row. Similarly, a number on the bottom row can move down one to end up at the top of that same column. 

Let the customer choose 0 and 1 as her Anchor and Direction numbers, respectively.

The so-called "secret number" --i.e. the correct number that must be selected in order to gain access to the 2FA-protected system-- is determined by "looking at" the middle number of the pinpad and then navigating in the same manner as the navigation from Anchor to Direction.

In the following pad,

`2 5 7`

`0 4 3`

`6 1 8`

we see that from Anchor (0) to Direction (1) can be expressed as "one to the right, then one down". (Note this is equivalent to "one down, then one to the right" or "left two, then up two"). By applying the same navigation but starting at the middle number, we find that the secret number is 8.
