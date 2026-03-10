# Java coding probelms for SDET
Pillars to master Java coding problems,

- **Practice consistently**
- **Identify patterns**
- **Break down the problem statement**
- **Use examples & pseudocode**
- **Explain your logic**
- **Solve more problems to build confidence**

### Some Problems

- *Palindrome number*
- *Reverse word or entire string*
- *Date format conversion*
- *Character sequence occurrence or decode strings*
- *Permutations & Combinations*
- *Second smallest Digit in a String - For example, if the input is "claude2403edualc", you need to find and return the digit*
- *Count Word Occurrences in a Sentence*
	1. Given a string like "my name is Claude Claude", the goal is to print each word along with how many times it appears.
	
# Selenium - topics
### Shadow DOM element access
- It is separate and hidden DOM tree and attached to the main DOM element which is called Shadow Host
- By using normal locators we can not access shadow DOM and NoSuchElementException will be thrown.
- This shadow DOM provides encapsulation for web components
- Now a days most of all browser supports it
- Shadow root is a top element in the shadow DOM.
- To view in the developer tools, enable 'Show user agent for Shadow DOM" settings
- Always use console expression to check it before use it.
- It can not be accessible by standard JavaScript i.e document.querySelector();
- Modes -> Closed and Open
- Open mode - We can access shadow DOM structure by CSS selector, XPATH will not work inside shadow DOM. It is design and w3c protocol defines the standard.
- Closed mode - We can not accessible Shadow DOM structure and will get null
- We need to use other strategy to access it or check with Dev team
- Ways to access,
- Using Selenium 4+, we have getShadowRoot() return the shadow root element if it is open otherwise it will give null.
- WebElement host = d.findElement(By.id("shadow-host"));
- SearchContext root = host.getShadowRoot();
- Using JavaScriptExecutor, we can use execute script to get the shadow root.
- If nested shadow root, we can go inside recursively and find the shadow root to access it is elements by CSS selectors
- If more shadow DOM, use Playwright it internally handles the shadow dom chaining
- In Selenium 2, 3, use single chain WebElement el = (JavascriptExecutor) driver).executeScript("arguments[0].shadowRoot", parentElement)
- WebElement deepElement = (WebElement) ((JavascriptExecutor) driver).executeScript(
    "return document.querySelector('#host-level-1')" +
    ".shadowRoot.querySelector('#host-level-2')" +
    ".shadowRoot.querySelector('#host-level-3')" +
    ".shadowRoot.querySelector('#target-element')"
);
- InvalidArgumentException if we use XPATH in shadow DOM, use CSS selectors
- StaleElementReferenceException if DOM re-rendered, use retry or relocate shadow host and so on
- Use dynamic wait to handle Shadow DOM.
- Reference: https://www.testmuai.com/blog/shadow-dom-in-selenium/
