import { useEffect, useState } from "react";
import "./App.css";


export default function App() {
  const [products, setProducts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/products") // <-- ako kod tebe nije ovo, promeni
      .then((res) => {
        if (!res.ok) throw new Error("HTTP " + res.status);
        return res.json();
      })
      .then(setProducts)
      .catch((e) => setError(e.message))
      .finally(() => setLoading(false));
  }, []);

  if (loading) return <div style={{ padding: 20 }}>Loading...</div>;
  if (error) return <div style={{ padding: 20, color: "crimson" }}>Error: {error}</div>;

  return (
    <div className="container">
      <h1 className="title">True Tactical Shop</h1>

      <div className="products">
        {products.map((p) => (
          <div key={p.id} className="card">
            <h2>{p.name}</h2>
            <p>{p.desc}</p>

            <p><b>Brand:</b> {p.brand}</p>
            <p><b>Category:</b> {p.category}</p>

            <p className="price">{p.price} RSD</p>
            <p>Stock: {p.quantity}</p>
          </div>
        ))}
      </div>
    </div>
  );

}
