# JavaFX Scene Graph

## Hierarchy Overview

**Stage → Scene → Nodes**

---

## Node Types

### 1. Layout Nodes (Containers)

Used to arrange other elements (like CSS flex/grid in web).

| Node         | Description                              |
|--------------|------------------------------------------|
| `VBox`       | Vertical arrangement                     |
| `HBox`       | Horizontal arrangement                   |
| `BorderPane` | Top, bottom, left, right, center regions |
| `GridPane`   | Grid layout (rows & columns)             |
| `StackPane`  | Elements stacked on top of each other    |

---

### 2. Control Nodes (UI Elements)

Interactive elements that users click, type, or select.

- `Button`
- `Label`
- `TextField`
- `PasswordField`
- `CheckBox`
- `RadioButton`
- `ComboBox`
- `ListView`
- `TableView`

---

### 3. Shape & Graphics Nodes

Used for drawing and visual elements.

- `Rectangle`
- `Circle`
- `Line`
- `Polygon`
- `ImageView` — for displaying images

---

## Core Concepts

### Stage

The top-level window of the application.

### Scene

The container held inside the Stage.

### Scene Graph

The tree of all visual nodes inside the Scene, made up of different nodes (text, buttons, inputs, etc.).

#### Container Node Types

| Type      | Description                 |
|-----------|-----------------------------|
| `Group`   | Normal fixed-size container |
| `Region`  | Responsive container        |
| `Control` | Interactive container       |

---

## Building the Scene Graph — Step by Step

1. **Create Nodes** — Assemble your visual elements
2. **Add to Root Node** — Place elements in a container
3. **Create a Scene** — Pass the root node to the Scene
4. **Set the Scene** — Attach the Scene to the Stage
5. **Show the Stage** — Call `stage.show()` to display

---

## Layout Container Reference

| Container    | Behaviour                                        |
|--------------|--------------------------------------------------|
| `VBox`       | Stacks nodes vertically                          |
| `HBox`       | Stacks nodes horizontally                        |
| `GridPane`   | Row/column grid                                  |
| `BorderPane` | Top / bottom / left / right / center regions     |
| `StackPane`  | Layers nodes on top of each other                |
| `AnchorPane` | Anchors nodes to edges — great for resizable UIs |
| `FlowPane`   | Wrapping row/column layout                       |
| `TilePane`   | Equal-sized tiles                                |
