<h2><a href="https://codeforces.com/contest/1206/problem/B" target="_blank" rel="noopener noreferrer">1206B — Make Product Equal One</a></h2>

| | |
|---|---|
| **Difficulty** | 900 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1206B](https://codeforces.com/contest/1206/problem/B) |

## Topics
`dp` `implementation`

---

## Problem Statement

<div class="header"><div class="title">B. Make Product Equal One</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given $$$n$$$ numbers $$$a_1, a_2, \dots, a_n$$$. With a cost of one coin you can perform the following operation:</p><p>Choose one of these numbers and add or subtract $$$1$$$ from it.</p><p>In particular, we can apply this operation to the same number several times.</p><p>We want to make the product of all these numbers equal to $$$1$$$, in other words, we want $$$a_1 \cdot a_2$$$ $$$\dots$$$ $$$\cdot a_n = 1$$$. </p><p>For example, for $$$n = 3$$$ and numbers $$$[1, -3, 0]$$$ we can make product equal to $$$1$$$ in $$$3$$$ coins: add $$$1$$$ to second element, add $$$1$$$ to second element again, subtract $$$1$$$ from third element, so that array becomes $$$[1, -1, -1]$$$. And $$$1\cdot (-1) \cdot (-1) = 1$$$.</p><p>What is the minimum cost we will have to pay to do that?</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains a single integer $$$n$$$ ($$$1 \le n \le 10^5$$$) — the number of numbers.</p><p>The second line contains $$$n$$$ integers $$$a_1, a_2, \dots, a_n$$$ ($$$-10^9 \le a_i \le 10^9$$$) — the numbers.</p></div><div class="output-specification"><div class="section-title">Output</div><p>Output a single number — the minimal number of coins you need to pay to make the product equal to $$$1$$$.</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id004408579677545055" id="id005932145267691873" class="input-output-copier">Copy</div></div><pre id="id004408579677545055">2
-1 1
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00602183323037056" id="id00882752741107384" class="input-output-copier">Copy</div></div><pre id="id00602183323037056">2</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id006894791434302249" id="id006007207266637142" class="input-output-copier">Copy</div></div><pre id="id006894791434302249">4
0 0 0 0
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id006530486850535524" id="id006246763057682448" class="input-output-copier">Copy</div></div><pre id="id006530486850535524">4</pre></div><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007977921521671346" id="id008277566357445786" class="input-output-copier">Copy</div></div><pre id="id007977921521671346">5
-5 -3 5 3 0
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id006501963382968624" id="id00147403491383727" class="input-output-copier">Copy</div></div><pre id="id006501963382968624">13</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first example, you can change $$$1$$$ to $$$-1$$$ or $$$-1$$$ to $$$1$$$ in $$$2$$$ coins.</p><p>In the second example, you have to apply at least $$$4$$$ operations for the product not to be $$$0$$$.</p><p>In the third example, you can change $$$-5$$$ to $$$-1$$$ in $$$4$$$ coins, $$$-3$$$ to $$$-1$$$ in $$$2$$$ coins, $$$5$$$ to $$$1$$$ in $$$4$$$ coins, $$$3$$$ to $$$1$$$ in $$$2$$$ coins, $$$0$$$ to $$$1$$$ in $$$1$$$ coin.</p></div>