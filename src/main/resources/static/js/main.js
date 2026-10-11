const sections = document.querySelectorAll("[data-bg]");
const layers = document.querySelectorAll(".bg");

// 顯示指定名稱的背景，其他的隱藏
function showBg(name) {
  layers.forEach((layer) => {
    layer.classList.toggle("active", layer.classList.contains("bg-" + name));
  });
}

// 標記「目前聚焦的版面」，同一時間只有一個
function setFocused(target) {
  sections.forEach((s) => s.classList.toggle("is-focused", s === target));
}

const observer = new IntersectionObserver(
  (entries) => {
    entries.forEach((entry) => {
      if (entry.isIntersecting) {
        showBg(entry.target.dataset.bg);
        setFocused(entry.target);
      }
    });
  },
  {
    rootMargin: "-50% 0px -50% 0px",
  },
);

sections.forEach((section) => observer.observe(section));
