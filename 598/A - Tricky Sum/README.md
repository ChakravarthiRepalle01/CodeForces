<h2><a href="https://codeforces.com/contest/598/problem/A" target="_blank" rel="noopener noreferrer">598A — Tricky Sum</a></h2>

| | |
|---|---|
| **Difficulty** | 900 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 598A](https://codeforces.com/contest/598/problem/A) |

## Topics
`math`

---

## Problem Statement

<div class="header"><div class="title">A. Tricky Sum</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>In this problem you are to calculate the sum of all integers from <span class="tex-span">1</span> to <span class="tex-span"><i>n</i></span>, but you should take all powers of two with minus in the sum.</p><p>For example, for <span class="tex-span"><i>n</i> = 4</span> the sum is equal to <span class="tex-span"> - 1 - 2 + 3 - 4 =  - 4</span>, because <span class="tex-span">1</span>, <span class="tex-span">2</span> and <span class="tex-span">4</span> are <span class="tex-span">2<sup class="upper-index">0</sup></span>, <span class="tex-span">2<sup class="upper-index">1</sup></span> and <span class="tex-span">2<sup class="upper-index">2</sup></span> respectively.</p><p>Calculate the answer for <span class="tex-span"><i>t</i></span> values of <span class="tex-span"><i>n</i></span>.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains a single integer <span class="tex-span"><i>t</i></span> (<span class="tex-span">1 ≤ <i>t</i> ≤ 100</span>) — the number of values of <span class="tex-span"><i>n</i></span> to be processed.</p><p>Each of next <span class="tex-span"><i>t</i></span> lines contains a single integer <span class="tex-span"><i>n</i></span> (<span class="tex-span">1 ≤ <i>n</i> ≤ 10<sup class="upper-index">9</sup></span>).</p></div><div class="output-specification"><div class="section-title">Output</div><p>Print the requested sum for each of <span class="tex-span"><i>t</i></span> integers <span class="tex-span"><i>n</i></span> given in the input.</p></div><div class="sample-tests"><div class="section-title">Examples</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id007025297708039966" id="id0047338486724620843" class="input-output-copier">Copy</div></div><pre id="id007025297708039966">2<br>4<br>1000000000<br></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id00906958613055571" id="id005366159588283804" class="input-output-copier">Copy</div></div><pre id="id00906958613055571">-4<br>499999998352516354<br></pre></div></div></div><div class="note"><div class="section-title">Note</div><p>The answer for the first sample is explained in the statement.</p></div>