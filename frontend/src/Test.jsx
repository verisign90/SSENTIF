import React, { useState, useEffect } from "react";
import axios from "axios";

function Test() {
  const [data, setData] = useState("");

  useEffect(() => {
    axios
      .get("https://ab37-218-237-73-29.ngrok-free.app/data", {
        headers: {
          "ngrok-skip-browser-warning": "true"
        }
      })
      .then((response) => {
        setData(response.data);
      })
      .catch((error) => {
        console.error("axios fetching error: ", error);
      });
  }, []);

  return (
    <>
      <h1>Hello Vite React</h1>
      <p>스프링부트에서 보낸 메시지 : {data}</p>
    </>
  );
}

export default Test;
