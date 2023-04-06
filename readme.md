# Get rid of boilerplate with Scala

Slides and examples for `Get rid of boilerplate with Scala` talk

## Building slides from sources

The slides are created with [Marp](https://github.com/marp-team/marp-cli/). The sources reside in `./slides`

### PDF

Building PDF from sources requires you to navigate to `./slides` and executing:

```bash
npx @marp-team/marp-cli@latest slides.md --allow-local-files -o slides.pdf
```
The output is in `slides.pdf`

### Interactive web presentation

You can also build an HTML document with interactive presentation. Navigate to `./slides` and execute:

```bash
npx @marp-team/marp-cli@latest slides.md --watch
```

Since this presentation is using transitions, please consult [marp transitions documentation](https://github.com/marp-team/marp-cli/blob/main/docs/bespoke-transitions/README.md#built-in-transition) for supported browser list.
