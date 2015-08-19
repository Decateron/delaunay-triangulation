#delaunay-triangulation [![Build Status](https://magnum.travis-ci.com/Decateron/delaunay-triangulation.svg?token=ZMKSt61qYsroKf5FBCgc&branch=master)](https://magnum.travis-ci.com/Decateron/delaunay-triangulation)

An application built for real-time rendering and analysis of Delaunay triangulations made with JavaFX 8. This program was written as part of an undergraduate research project done under Dr. Keil at the University of Saskatchewan.

This program supports most edge cases, although that isn't formally tested. There currently isn't support for displaying multiple versions of non-unique Delaunay triangulations. The algorithm used to compute the Delaunay triangulation is also inefficient (O(n^4) complexity), so the program will slow down quickly above 50 or so points.
