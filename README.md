# Tetra-Square-Symmetries
Exploration of permutations of objects with 4 vertices
** I would very much like to revisit this topic with someone who knows more about the topic in order to fully grasp this 'discovery' for what it is. I'm certain this is nothing but a slightly different perspective on permutation sets, but would love to hear from others. **

While studying abstract algebra I became interested in the permutations of shapes and objects with 4 vertices. To further explore the nature of these permutations I wrote this application to quickly calculate the various sets involved.

The main curiosity of the project was the transform like quality of converting a square to a tetrahedron and back using the permutation list.

The main idea is as follows:
A square has a certain number of valid rotations. These are 90 degree rotations, a diagonal flip, a horizontal flip, etc. In each of these cases, you start with a 2 dimensional square, and the result after the move is a 2 dimensional square. This can be imagined by taking a square peice of paper and visualizing it being turned and flipped in valid ways. However, the paper cannot be twisted or torn.

Example Square rotation:
1 2
4 3

This is a square with 1 being the upper left vertex, 3 being the lower right vertex etc. We will consider an easier notation for this square as [1,2,3,4]

A valid rotation of the square is:
4 1
3 2

Here a 90 clockwise rotation is applied. The result is [4,1,2,3] which is a valid square. There are only 24 possible rotations of 4 positions, essentially there are only 24 ways to list [a,b,c,d]. Of these 24 permutations, 8 are valid squares while 12 are valid tetrahedron permutations.
There is an interesting overlap between the valid tetrahedron and square permutations. Four of the valid square permutations are also valid tetrahedron permutations. This means that combined, the valid tetrahedron and square permutations represent only 16 of the total 24 possible rotations of 4 vertices. So what are these 8 'invalid' permutations?
I sorted the sets into distinct sets, S are the permutations owned solely by the square, T is the set of permutations owned solely by the tetrahedron and X is the 4 permutations they share. This leaves the 8 unclaimed permutations which I called U. It is the behavior of this U set that prompted the creation of this program.

If you take a valid square, and you apply an unclaimed permutation to the square, you will end up with a valid tetrahedron. It seems that the unclaimed 'invalid' rotations of the set of 24 can be used as transforms to convert a square to a tetrahedron. That tetrahedron can then be rotated freely in valid tetrahedral ways. If one would like to return back to a valid square, there are other corresponding unclaimed rotations that can be used to convert the tetrahedron back to a square, however only half the unclaimed can be used in this deconstructive manner. The other unclaimed, when applied to a tetrahedron, result in another unclaimed permutation, leaving the shape in this unknown territory. However, if this same unclaimed permutation is applied again, the result yeilds a Shared permutation.

I have no application in anyway for this result, but it seems like a very simplistic way to teach how fourier and laplace transforms work. The part most interesting to me is the dimensionality of taking a square to higher dimensional space and back down again.
