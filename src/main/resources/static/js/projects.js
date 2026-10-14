// 截圖點擊放大
const lightbox = document.getElementById("lightbox");

if (lightbox) {
  const img = lightbox.querySelector(".lightbox-img");
  const caption = lightbox.querySelector(".lightbox-caption");

  // 點到任何一個 .shot-btn，就把它的大圖和圖說放進視窗並打開
  document.addEventListener("click", (e) => {
    const btn = e.target.closest(".shot-btn");
    if (!btn) return;

    img.src = btn.dataset.full;
    img.alt = btn.dataset.caption;
    caption.textContent = btn.dataset.caption;
    lightbox.showModal();
  });

  // 點視窗裡的任何地方（除了圖片本身）就關閉
  lightbox.addEventListener("click", (e) => {
    if (e.target !== img) lightbox.close();
  });

  // 關閉後清掉圖片，下次打開才不會先閃一下舊圖
  lightbox.addEventListener("close", () => {
    img.removeAttribute("src");
  });
}
